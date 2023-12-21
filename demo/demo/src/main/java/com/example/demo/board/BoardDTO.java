package com.example.demo.board;

import org.apache.ibatis.type.Alias;

@Alias("BoardDTO")
public class BoardDTO {

    private String serno; // 일련번호
    private String useYn; // 사용 여부
    private String rgstId; // 등록자 ID
    private String rgstDt; // 등록일
    private String rvseId; // 수정자 ID
    private String rvseDt; // 수정일
    private String title; // 제목
    private String cont; // 내용
    private String fileId; // 파일 ID
    private String hts; // 조회수


    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    public String getRgstId() {
        return rgstId;
    }

    public void setRgstId(String rgstId) {
        this.rgstId = rgstId;
    }

    public String getRgstDt() {
        return rgstDt;
    }

    public void setRgstDt(String rgstDt) {
        this.rgstDt = rgstDt;
    }

    public String getRvseId() {
        return rvseId;
    }

    public void setRvseId(String rvseId) {
        this.rvseId = rvseId;
    }

    public String getRvseDt() {
        return rvseDt;
    }

    public void setRvseDt(String rvseDt) {
        this.rvseDt = rvseDt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getHts() {
        return hts;
    }

    public void setHts(String hts) {
        this.hts = hts;
    }
}
