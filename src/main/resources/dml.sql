INSERT INTO
    Category(Id, Name, Status)
VALUES
    (1, 'todo', TRUE),
    (2, 'progress', TRUE),
    (3, 'done', TRUE);

INSERT INTO
    Card(Id, Contents, Created_Time, Modified_Time, Status, Category)
VALUES
    (1, 'Spring boot', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), TRUE, 3),
    (2, 'Spring data', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), TRUE, 2),
    (3, 'ddd aggregate', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), TRUE, 1),
    (4, 'aggregate root', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), TRUE, 1);
