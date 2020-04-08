INSERT INTO
    Category(Id, Name, Status)
VALUES
    (1, '해야 할 일', TRUE),
    (2, '하고 있는 일', TRUE),
    (3, '완료된 일', TRUE);

INSERT INTO
    Card(Id, Contents, Created_Time, Modified_Time, Category)
VALUES
    (1, 'Spring boot와 MySQL 연결', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), TRUE, 3),
    (2, 'Spring data jdbc 학습', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), TRUE, 2),
    (3, 'ddd aggregate root 선택 기준', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), TRUE, 1),
    (4, 'aggregate root를 통해 CRUD 로직 구현', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), TRUE, 1);
