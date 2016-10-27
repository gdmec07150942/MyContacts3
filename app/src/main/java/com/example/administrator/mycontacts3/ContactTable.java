package com.example.administrator.mycontacts3;



        import android.content.ContentValues;
        import android.content.Context;

/**
 * Created by yejs on 2016/10/26.
 */
public class ContactTable {
    private final static  String TABLENAME="contactsTable";
    private MyDB db;
    public ContactTable(Context context) {
        db=new MyDB(context);
        if(!db.isTableExits(TABLENAME)){
            String createTableSql = "CREATE TABLE IF NOT EXISTS" + TABLENAME + "(id_DB integer"+
                    "primary key AUTOINCREMENT,"+
                    user.NAME+"VARCHAR,"+
                    user.MOBILE+"VARCHAR,"+
                    user.QQ+"VARCHAR,"+
                    user.DANWEI+"VARCHAR,"+
                    user.ADDRESS+"VARCHAR,";
            db.createTable(createTableSql);
        }
    }
    public boolean addData( user user){
        ContentValues valuse=new ContentValues();

        valuse.put( user.NAME,user.getName());
        valuse.put( user.MOBILE,user.getMobile());
        valuse.put( user.DANWEI,user.getDanwei());
        valuse.put( user.QQ,user.getQq());
        valuse.put( user.ADDRESS,user.getAddress());

        return db.save(TABLENAME,valuse);
    }
}
