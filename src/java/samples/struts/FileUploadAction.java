/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.struts;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author DuongPTHSE62871
 */
public class FileUploadAction extends ActionSupport implements ServletRequestAware {

    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    private HttpServletRequest servletRequest;

    public FileUploadAction() {
    }

    public String execute() throws Exception {

        String filePath = servletRequest.getSession().getServletContext().getRealPath("/").concat("userimages");

        System.out.println("Image Location:" + filePath);//quan sat server console de thay vi tri thuc su
        File fileToCreate = new File(filePath, this.userImageFileName);
        FileUtils.copyFile(this.userImage, fileToCreate);//sao chep hinh anh trong file moi

        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }

    /**
     * @return the userImage
     */
    public File getUserImage() {
        return userImage;
    }

    /**
     * @param userImage the userImage to set
     */
    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }

    /**
     * @return the userImageContentType
     */
    public String getUserImageContentType() {
        return userImageContentType;
    }

    /**
     * @param userImageContentType the userImageContentType to set
     */
    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }

    /**
     * @return the userImageFileName
     */
    public String getUserImageFileName() {
        return userImageFileName;
    }

    /**
     * @param userImageFileName the userImageFileName to set
     */
    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }

    /**
     * @return the servletRequest
     */
    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

}
