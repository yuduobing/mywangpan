package com.micro.disk.bean;


import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class MergeRequest2 implements Serializable {
    private String userid; //用户id
    private String username;
    private String pid; //文件pid（上传到哪个文件夹下）
    private String uuid; //前端上传uuid

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getFilemd5() {
        return filemd5;
    }

    public void setFilemd5(String filemd5) {
        this.filemd5 = filemd5;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public String getAlbumid() {
        return albumid;
    }

    public void setAlbumid(String albumid) {
        this.albumid = albumid;
    }

    public String getRelativepath() {
        return relativepath;
    }

    public void setRelativepath(String relativepath) {
        this.relativepath = relativepath;
    }

    public boolean isExistindiskmd5() {
        return existindiskmd5;
    }

    public void setExistindiskmd5(boolean existindiskmd5) {
        this.existindiskmd5 = existindiskmd5;
    }

    public boolean isExistindiskfile() {
        return existindiskfile;
    }

    public void setExistindiskfile(boolean existindiskfile) {
        this.existindiskfile = existindiskfile;
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    public String getFilesuffix() {
        return Filesuffix;
    }

    public void setFilesuffix(String filesuffix) {
        Filesuffix = filesuffix;
    }

    public String getThumbnailurl() {
        return thumbnailurl;
    }

    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }

    public String getImgsize() {
        return imgsize;
    }

    public void setImgsize(String imgsize) {
        this.imgsize = imgsize;
    }

    public String getDiskfileid() {
        return diskfileid;
    }

    public void setDiskfileid(String diskfileid) {
        this.diskfileid = diskfileid;
    }

    private String fileid; //前端上传的文件id
    private String filemd5; //文件md5
    private String filename; //文件名称
    private long totalSize; //文件大小
    private String albumid; //相册【*】
    private String relativepath; //文件夹上传（路径）【*】


    private boolean existindiskmd5;//是否存在
    private boolean existindiskfile;//是否存在

    //如果存在disk_md5，则从里面取；否则从临时记录获取和裁剪获取
    private String typecode;
    private String Filesuffix;
    private String thumbnailurl;
    private String imgsize;

    private String diskfileid;
}
