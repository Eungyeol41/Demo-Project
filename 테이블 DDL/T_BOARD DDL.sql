-- table 생성
CREATE TABLE DEMO_U.T_BOARD
(
    SEQ_NO NUMBER NOT NULL,
    USE_YN VARCHAR2(1) DEFAULT 'Y',
    RGST_ID VARCHAR2(20) NOT NULL,
    RGST_DT DATE DEFAULT sysdate,
    RVSE_ID VARCHAR2(20) NOT NULL,
    RVSE_DT DATE DEFAULT sysdate,
    TITLE VARCHAR2(300),
    CONT CLOB,
    FILE_ID VARCHAR2(20),
    HTS NUMBER DEFAULT 0,
    CONSTRAINT T_BOARD_PK PRIMARY KEY (SEQ_NO)
)
TABLESPACE SPRING_DEMO;

COMMENT ON COLUMN DEMO_U.T_BOARD.SEQ_NO IS '일련번호';
COMMENT ON COLUMN DEMO_U.T_BOARD.USE_YN IS '사용 여부';
COMMENT ON COLUMN DEMO_U.T_BOARD.RGST_ID IS '등록자 ID';
COMMENT ON COLUMN DEMO_U.T_BOARD.RGST_DT IS '등록일';
COMMENT ON COLUMN DEMO_U.T_BOARD.RVSE_ID IS '수정자 ID';
COMMENT ON COLUMN DEMO_U.T_BOARD.RVSE_DT IS '수정일';
COMMENT ON COLUMN DEMO_U.T_BOARD.TITLE IS '제목';
COMMENT ON COLUMN DEMO_U.T_BOARD.CONT IS '내용';
COMMENT ON COLUMN DEMO_U.T_BOARD.FILE_ID IS '파일 ID';
COMMENT ON COLUMN DEMO_U.T_BOARD.HTS IS '조회수';