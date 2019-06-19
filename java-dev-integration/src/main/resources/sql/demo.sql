drop table if exists user;
create table user
(
  user_id bigint not null,
  user_name varchar(50) not null,
  password varchar(50) not null,
  mobile varchar(20) not null,
  email varchar(50),
  role tinyint not null default 0,
  create_time timestamp not null default current_timestamp,
  update_time timestamp,
  primary key (user_id)
);

insert into
  user(user_id, user_name, password, mobile, email, role)
values
  (6171036412280832, '张三', '333333', '18900003333', 'zhangsan@qq.com', 0),
  (6171920391208960, '李四', '444444', '18900004444', 'lisi@qq.com', 1),
  (6172045830258688, '王五', '555555', '18900005555', 'wangwu@qq.com', 2);