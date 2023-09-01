INSERT INTO board(no, title, content, writer)
(SELECT SEQ_BOARD.NEXTVAL, title, content, writer FROM
board);
commit;

ALTER TABLE board ADD CONSTRAINT PK_BOARD PRIMARY KEY(no);

SELECT * FROM  board ORDER BY no DESC;