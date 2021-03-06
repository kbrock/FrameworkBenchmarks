package com.techempower.act.pgsql.domain;


import act.db.DB;
import act.db.ebean.EbeanDao;

import javax.persistence.Entity;

@DB("pgsql")
@Entity
public class Fortune extends com.techempower.act.sql.domain.Fortune {

    public Fortune(Integer id, String message) {
        super(id, message);
    }

    public static class Dao extends EbeanDao<Integer, Fortune> {}
}
