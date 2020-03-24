INSERT INTO ticket (ticket_id, project_name, parent_id, title, estimate, status, type, description, created_by, assignee, created_date)
VALUES
('aa3458ca-6dc4-11ea-b3ba-0242ac140002', 'ZIRA', null, 'Ticket管理功能',7, 'ready', 'story','完成 Ticket service 中的接口以及其Graphql的接口和Web界面','1bd358a8-24ac-11ea-b286-0242ac110002',null ,now()),
('f2ea347b-6dc5-11ea-b3ba-0242ac140002', 'ZIRA', 'aa3458ca-6dc4-11ea-b3ba-0242ac140002','Ticket管理 前端',3,'ready','task','完成 Ticket前端开发','502f273d-3061-11ea-921f-0242ac110002',null ,now()),
('adc25757-6dc6-11ea-b3ba-0242ac140002', 'ZIRA', 'f2ea347b-6dc5-11ea-b3ba-0242ac140002','Ticket管理 webUI ',1,'ready','sub-task','完成 Ticket UI 页面编写','502f273d-3061-11ea-921f-0242ac110002','502f273d-3061-11ea-921f-0242ac110002' ,now()),
('690cd02b-6dc7-11ea-b3ba-0242ac140002', 'ZIRA', 'f2ea347b-6dc5-11ea-b3ba-0242ac140002','Ticket管理 前端逻辑',2,'ready','sub-task','完成 Ticket 前端逻辑编写','502f273d-3061-11ea-921f-0242ac110002','502f273d-3061-11ea-921f-0242ac110002' ,now()),
('0ec06971-6dc8-11ea-b3ba-0242ac140002', 'ZIRA', 'aa3458ca-6dc4-11ea-b3ba-0242ac140002','Ticket管理 后端',4,'ready','task','完成 Ticket Service 、Graphql Service 编写','1bd358a8-24ac-11ea-b286-0242ac110002','1bd358a8-24ac-11ea-b286-0242ac110002' ,now()),
('42905d77-6dc9-11ea-b3ba-0242ac140002', 'ZIRA', '0ec06971-6dc8-11ea-b3ba-0242ac140002','Ticket Service管理',2,'ready','sub-task','完成 Ticket Service 后端逻辑编写','1bd358a8-24ac-11ea-b286-0242ac110002','1bd358a8-24ac-11ea-b286-0242ac110002' ,now()),
('cd09379e-6dc9-11ea-b3ba-0242ac140002', 'ZIRA', '0ec06971-6dc8-11ea-b3ba-0242ac140002','Graphql Service管理',2,'ready','sub-task','完成 Graphql Service 后端逻辑编写','1bd358a8-24ac-11ea-b286-0242ac110002','1bd358a8-24ac-11ea-b286-0242ac110002' ,now()),

('c0565202-6dcb-11ea-b3ba-0242ac140002', 'ZIRA', null, 'User 管理功能',7,'ready','story','完成 User service 中的接口以及其Graphql的接口和Web界面','1bd358a8-24ac-11ea-b286-0242ac110002',null ,now()),
('d4553c53-6dcb-11ea-b3ba-0242ac140002', 'ZIRA', 'c0565202-6dcb-11ea-b3ba-0242ac140002','User 管理 前端',3,'ready','task','完成 User 前端开发','502f273d-3061-11ea-921f-0242ac110002',null ,now()),
('f1ecc761-6dcb-11ea-b3ba-0242ac140002', 'ZIRA', 'd4553c53-6dcb-11ea-b3ba-0242ac140002','User 管理 webUI ',1,'ready','sub-task','完成 User UI 页面编写','502f273d-3061-11ea-921f-0242ac110002','502f273d-3061-11ea-921f-0242ac110002' ,now()),
('f8572c85-6dcb-11ea-b3ba-0242ac140002', 'ZIRA', 'd4553c53-6dcb-11ea-b3ba-0242ac140002','User 管理 前端逻辑',2,'ready','sub-task','完成 User 前端逻辑编写','502f273d-3061-11ea-921f-0242ac110002','502f273d-3061-11ea-921f-0242ac110002' ,now()),
('06a74b7a-6dd2-11ea-94f4-0242ac110002', 'ZIRA', 'c0565202-6dcb-11ea-b3ba-0242ac140002','User 管理 后端',4,'ready','task','完成 User Service 、Graphql Service 编写','1bd358a8-24ac-11ea-b286-0242ac110002','1bd358a8-24ac-11ea-b286-0242ac110002' ,now()),
('feabd53e-6dcb-11ea-b3ba-0242ac140002', 'ZIRA', '06a74b7a-6dd2-11ea-94f4-0242ac110002','User Service管理',2,'ready','sub-task','完成 User Service 后端逻辑编写','1bd358a8-24ac-11ea-b286-0242ac110002','1bd358a8-24ac-11ea-b286-0242ac110002' ,now()),
('06047ed6-6dcc-11ea-b3ba-0242ac140002', 'ZIRA', '06a74b7a-6dd2-11ea-94f4-0242ac110002','Graphql Service管理',2,'ready','sub-task','完成 Graphql Service 后端逻辑编写','1bd358a8-24ac-11ea-b286-0242ac110002','1bd358a8-24ac-11ea-b286-0242ac110002' ,now()),

('0eda9e32-6dcc-11ea-b3ba-0242ac140002', 'ZIRA', null, 'Project 管理功能',7,'ready','story','完成 Project service 中的接口以及其Graphql的接口和Web界面','1bd358a8-24ac-11ea-b286-0242ac110002',null ,now()),
('1ba3ea38-6dcc-11ea-b3ba-0242ac140002', 'ZIRA', '0eda9e32-6dcc-11ea-b3ba-0242ac140002','Project 管理 前端',3,'ready','task','完成 Project 前端开发','502f273d-3061-11ea-921f-0242ac110002',null ,now()),
('44649303-6dcc-11ea-b3ba-0242ac140002', 'ZIRA', '1ba3ea38-6dcc-11ea-b3ba-0242ac140002','Project 管理 webUI ',1,'ready','sub-task','完成 Project UI 页面编写','502f273d-3061-11ea-921f-0242ac110002', '502f273d-3061-11ea-921f-0242ac110002' ,now()),
('4cd4035e-6dcc-11ea-b3ba-0242ac140002', 'ZIRA', '1ba3ea38-6dcc-11ea-b3ba-0242ac140002','Project 管理 前端逻辑',2,'ready','sub-task','完成 Project 前端逻辑编写','502f273d-3061-11ea-921f-0242ac110002','502f273d-3061-11ea-921f-0242ac110002' ,now()),
('384d2a19-6dcc-11ea-b3ba-0242ac140002', 'ZIRA', '0eda9e32-6dcc-11ea-b3ba-0242ac140002','Project 管理 后端',4,'ready','task','完成 Project Service 、Graphql Service 编写','1bd358a8-24ac-11ea-b286-0242ac110002','1bd358a8-24ac-11ea-b286-0242ac110002' ,now()),
('53ca9eb5-6dcc-11ea-b3ba-0242ac140002', 'ZIRA', '384d2a19-6dcc-11ea-b3ba-0242ac140002','Project Service管理',2,'ready','sub-task','完成 Project Service 后端逻辑编写','1bd358a8-24ac-11ea-b286-0242ac110002','1bd358a8-24ac-11ea-b286-0242ac110002' ,now()),
('59cf0a7c-6dcc-11ea-b3ba-0242ac140002', 'ZIRA', '384d2a19-6dcc-11ea-b3ba-0242ac140002','Graphql Service管理',2,'ready','sub-task','完成 Graphql Service 后端逻辑编写','1bd358a8-24ac-11ea-b286-0242ac110002','1bd358a8-24ac-11ea-b286-0242ac110002' ,now());
