use casintelamp;
drop table if exists l_group;
drop table if exists l_group_poles;
drop table if exists logs;
drop table if exists messages;
drop table if exists poles;
drop table if exists r_device_plan;
drop table if exists r_devices;
drop table if exists r_media;
drop table if exists r_plan_media;
drop table if exists r_plans;
drop table if exists streets;
drop table if exists users;

create table l_group
(
   id                   int not null auto_increment,
   name                 varchar(100),
   time_on              varchar(50),
   time_off             varchar(50),
   notes                varchar(200),
   primary key (id)
);

alter table l_group comment '照明系统：路灯分组';

create table l_group_poles
(
   id                   int not null auto_increment,
   group_id             int,
   pole_id              int,
   primary key (id)
);

alter table l_group_poles comment '照明系统：路灯所属的分组';

create table logs
(
   id                   int(10) unsigned not null auto_increment comment '主键ID',
   user_id              int default 0 comment '用户名，为md5后的值',
   typ                  tinyint default 0,
   time                 datetime,
   url                  varchar(500),
   ip                   varchar(100),
   useragent            varchar(500),
   args                 varchar(500),
   primary key (id)
)
ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';

alter table logs comment '后台操作日志';

create table messages
(
   id                   int(10) unsigned not null auto_increment comment '主键ID',
   typ                  tinyint default 0,
   time                 datetime,
   street_id            int,
   pole_id              int,
   device_typ           tinyint,
   device_sn            varchar(100),
   content              varchar(500),
   status               tinyint,
   primary key (id)
)
ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';

alter table messages comment '消息表：报警消息、提示消息等';

create table poles
(
   id                   int(11) unsigned not null auto_increment comment '主键ID',
   streetid             int,
   pole_sn              varchar(100) not null default '0' comment '所属客户ID',
   ctrl_sn              varchar(100),
   name                 varchar(200) default '' comment '灯杆名称',
   typ                  tinyint,
   latitude             varchar(200) default '' comment '纬度',
   longitude            varchar(200) default '' comment '经度',
   status               tinyint default 0 comment '状态:0关闭,1开启,100故障,200失联',
   air_sn               varchar(100),
   radio_sn             varchar(100),
   camera_sn            varchar(100),
   charger_sn           varchar(100),
   primary key (id)
)
ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='灯杆表';

alter table poles comment '以街道为载体的灯杆信息';

create table r_device_plan
(
   id                   int not null,
   device_no            varchar(100),
   plan_id              int,
   primary key (id)
);

create table r_devices
(
   no                   varchar(100),
   name                 varchar(100),
   version              varchar(100),
   nettype              tinyint comment '网络类型:1有线 2无线',
   volume               int,
   status               tinyint comment '0关闭 1播报中 100故障 200失联'
);

create table r_media
(
   id                   int not null,
   name                 varchar(100),
   typ                  tinyint comment '类型:1音频 2视频 3文字',
   url                  varchar(200),
   userid               int,
   create_time          datetime,
   primary key (id)
);

create table r_plan_media
(
   id                   int not null,
   plan_id              int,
   media_id             int,
   primary key (id)
);

create table r_plans
(
   id                   int not null,
   name                 varchar(100),
   start_date           datetime,
   end_date             datetime,
   play_begin           time,
   play_end             time,
   typ                  tinyint comment '1音频 2视频 3文字',
   iscycle              tinyint,
   notes                varchar(200),
   status               tinyint,
   primary key (id)
);

create table streets
(
   id                   int(11) unsigned not null auto_increment comment '主键ID',
   name                 varchar(200) default '' comment '灯杆名称',
   heartbeat            int default 0 comment '别名',
   latitude             varchar(100) default '' comment '定位纬度',
   longitude            varchar(100) default '' comment '定位经度',
   reporttime           varchar(100) default '' comment '能耗上报时间',
   typ                  tinyint comment '控制类型:默认[单灯]',
   power                int comment '定损功率:10w',
   belongto             int comment '所属用户',
   status               tinyint default 0 comment '状态，0未开通、1正常、2故障',
   primary key (id)
)
ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='灯杆表';

alter table streets comment '街道是路灯的载体,所有路灯都归属与某个街道.';

create table users
(
   id                   int(10) unsigned not null auto_increment comment '主键ID',
   name                 varchar(100) default '' comment '用户名，为md5后的值',
   mobile               varchar(20) comment '手机号',
   password             varchar(100) default '' comment '密码',
   address              varchar(200) comment '所属辖区完整显示',
   province             varchar(100) comment '所属辖区-省市',
   city                 varchar(100) comment '所属辖区-市区',
   county               varchar(100) comment '所属辖区-区县',
   streets              int comment '管理街道的数量',
   notes                varchar(500) comment '备注',
   typ                  tinyint default 0 comment '用户类型，超管0，管理员1，普通用户2',
   status               tinyint default 0 comment '状态，0未开通、1正常、2禁用 ',
   primary key (id)
)
ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';

alter table users comment '超管：不可删除、只能管理账户，不可操作业务。管理员：不可删除、可以管理普通用户、可以维护设备、可以操作业务';

