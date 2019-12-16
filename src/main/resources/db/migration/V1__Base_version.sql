CREATE TABLE ticket(
    ticket_id VARCHAR(36) PRIMARY KEY NOT NULL,
    ticket_number INTEGER NOT NULL AUTO_INCREMENT,
    project_id VARCHAR(36) NOT NULL,
    parent_id VARCHAR(36),
    title VARCHAR(256),
    estimate SMALLINT,
    status VARCHAR(256),
    type VARCHAR(32),
    description VARCHAR(2048),
    created_by VARCHAR(36) NOT NULL,
    assignee VARCHAR(36),
    created_date TIMESTAMP,
    update_date TIMESTAMP,
    KEY (project_id, ticket_number)
) ENGINE = MyISAM;

CREATE TABLE ticket_subscription(
    ticket_id VARCHAR(36) NOT NULL,
    user_id VARCHAR(36) NOT NULL,
    PRIMARY KEY(ticket_id, user_id)
);