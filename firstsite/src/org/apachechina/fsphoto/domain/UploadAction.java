package org.apachechina.fsphoto.domain;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;



/**
 * 
 * 上传的测试类.需要commons-io  和 commons-fileUpload的支持.
 * 自动生成到outDir目录.
 * @author 倪森  @Email  nisen.cn@gmail.com 
 * 类创建时间: 2006-12-7 9:46:51
 * 
*/
public class UploadAction {
    private boolean writeToFile=true;
    private File outDir = new File("C:\\test\\");
 
    /**
     * 
     */
    public UploadAction() {     
       
    }
    
    

    /**
     * @param outDir
     */
    public UploadAction(File outDir) {
       
        this.outDir = outDir;
    }



    /**
     * 模拟Struct中的处理Action主要处理参数输入和处理流程,具体的处理在mamnage包,简单的在这里.
     * 
     * @param request
     * @param response
     * @throws IOException
     */
    public void process(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        

        request.setCharacterEncoding("UTF-8");
//      Create a factory for disk-based file items
        FileItemFactory factory = new DiskFileItemFactory();

//      Create a new file upload handler
        ServletFileUpload upload = new ServletFileUpload(factory);
       // boolean isMultipart = ServletFileUpload.isMultipartContent(request);
       // System.out.println("isMultipart");

//      Parse the request
        try {
            List /* FileItem */ items = upload.parseRequest(request); //解析request
//          Process the uploaded items
            Iterator iter = items.iterator();
            while (iter.hasNext()) {
                FileItem item = (FileItem) iter.next();
 
                if (item.isFormField()) {
                    //processFormField(item);
                } else {
                    processUploadedFile(item);
                }
            }
            
        } catch (FileUploadException e) {
            throw new RuntimeException("fileUpdload",e);
        } catch (Exception e) {
            throw new RuntimeException("other",e);
        }
        
        
    }

    private void processUploadedFile(FileItem item) throws Exception {
//      Process a file upload
        if (!item.isFormField()) {
        	
            String fieldName = item.getFieldName();
            String fileName = item.getName();
            String contentType = item.getContentType();
            boolean isInMemory = item.isInMemory();
            long sizeInBytes = item.getSize();            
            
            System.out.println(item);
//          Process a file upload
            if (writeToFile) {

     
                String shortName=FilenameUtils.getName(fileName);    //得到文件名             
//                System.out.println(shortName);
                if (!outDir.exists()) FileUtils.forceMkdir(outDir);  //产生目录
            	
                File uploadedFile = new File(outDir,shortName);  //  
                
//              Process a file upload in memory
                item.write(uploadedFile);  //输出到文件
                
            } else {
//                InputStream uploadedStream = item.getInputStream();
//                uploadedStream.close();
//                byte[] data = item.get();
                
            }
            
           // ...
        }
        
    }

    private void processFormField(FileItem item) {
//      Process a regular form field
        if (item.isFormField()) {
            String name = item.getFieldName();
            String value = item.getString();
        }
    }



    /**
     * @return 返回 outDir。
     */
    public File getOutDir() {
        return outDir;
    }

    /**
     * @param outDir 要设置的 outDir。
     */
    public void setOutDir(File outDir) {
        this.outDir = outDir;
    }
    
    
    
    
    /*
     * @see javax.servlet.GenericServlet#init()
     */
    public void init() throws ServletException {
    	
    }

    /*
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    /*
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }
    

}
