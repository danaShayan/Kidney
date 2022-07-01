package com.example.kidney.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.recyclerview.widget.RecyclerView;

import com.example.kidney.Adapter.HistoryAdapter;
import com.example.kidney.Adapter.PreviousExperimentsAdapter;
import com.example.kidney.Adapter.SonographyAdapter;
import com.example.kidney.Adapter.UserAdapter;
import com.example.kidney.Model.History;
import com.example.kidney.Model.PreviousExperiments;
import com.example.kidney.Model.Sonography;
import com.example.kidney.Model.User;

import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "Kidney";
    private static final int DB_VERSION = 1;
    public static final String USER = "user";
    private static final String HISTORY = "history";
    private static final String PREVIOUS_EXPERIMENTS = "Previous_Experiments";
    private static final String SONOGRAPHY = "sonography";
    private Context context;


    // history
    List<History> list = new ArrayList<>();
    HistoryAdapter historyAdapter;

    // Previous
    List<PreviousExperiments> previousExperimentsList = new ArrayList<>();
    PreviousExperimentsAdapter previousExperimentsAdapter;

    //Sonography
    List<Sonography> sonographyList = new ArrayList<>();
    SonographyAdapter sonographyAdapter;
    //Sonography
    List<User> userList = new ArrayList<>();
    UserAdapter userAdapter;


    public static final String CREATE_USER = "create table " + USER + " ("
            + "id integer primary key autoincrement, "
            + "name text, "
            + "last_name text, "
            + "age text, "
            + "weight txt, "
            + "height txt, "
            + "gender txt)";


    public static final String CREATE_HISTORY = "create table " + HISTORY + " ("
            + "id integer primary key autoincrement, "
            + "duration text, "
            + "drowsiness text, "
            + "changes text, "
            + "handsAndFoot txt, "
            + "ex_protein txt, "
            + "urinary txt, "
            + "urinary_color txt, "
            + "urinary_volume txt, "
            + "hospital_history txt, "
            + "date txt)";
    public static final String CREATE_PREVIOUS = "create table " + PREVIOUS_EXPERIMENTS + " ("
            + "id integer primary key autoincrement, "
            + "date text, "
            + "result text, "
            + "next text, "
            + "report txt )";
    public static final String CREATE_SONOGRAPHY = "create table " + SONOGRAPHY + " ("
            + "id integer primary key autoincrement, "
            + "date text, "
            + "result text, "
            + "next text, "
            + "report txt)";


    public static final String READ_HISTORY = "SELECT * FROM " + HISTORY + " ORDER BY id DESC";
    public static final String READ_PREVIOUS = "SELECT * FROM " + PREVIOUS_EXPERIMENTS + " ORDER BY id DESC";
    public static final String READ_SONOGRAPHY = "SELECT * FROM " + SONOGRAPHY + " ORDER BY id DESC";
    public static final String READ_USER = "SELECT * FROM " + USER + " ORDER BY id DESC";


    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_USER);
        sqLiteDatabase.execSQL(CREATE_HISTORY);
        sqLiteDatabase.execSQL(CREATE_PREVIOUS);
        sqLiteDatabase.execSQL(CREATE_SONOGRAPHY);

    }

    public void addUser(String name, String last_name, String age, String weight, String height, String gender) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put("name", name);
        values.put("last_name", last_name);
        values.put("age", age);
        values.put("weight", weight);
        values.put("height", height);
        values.put("gender", gender);

        db.insert(USER, null, values);
        db.close();

    }

    public void readUser(RecyclerView recyclerView) {


        SQLiteDatabase sq = this.getReadableDatabase();
        Cursor cursor = sq.rawQuery(READ_USER, null);
        if (cursor.moveToNext()) {
            do {
                User user = new User();
                user.setName(cursor.getString(1));
                user.setLastName(cursor.getString(2));
                user.setAge(cursor.getString(3));
                user.setWeight(cursor.getString(4));
                user.setHeight(cursor.getString(5));
                user.setGender(cursor.getString(6));

                userList.add(user);
                userAdapter = new UserAdapter(context, userList);
                recyclerView.setAdapter(userAdapter);


            }
            while (cursor.moveToNext());
        }
        cursor.close();
    }


    public void addHistory(String duration, String drowsiness, String changes, String handsAndFoot, String ex_protein, String urinary, String urinary_volume, String urinary_color, String hospital_history, String date) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();


        values.put("duration", duration);
        values.put("drowsiness", drowsiness);
        values.put("changes", changes);
        values.put("handsAndFoot", handsAndFoot);
        values.put("ex_protein", ex_protein);
        values.put("urinary", urinary);
        values.put("urinary_volume", urinary_volume);
        values.put("urinary_color", urinary_color);
        values.put("hospital_history", hospital_history);
        values.put("date", date);

        db.insert(HISTORY, null, values);
        db.close();


    }

    public void readHistory(RecyclerView recyclerView) {


        SQLiteDatabase sq = this.getReadableDatabase();
        Cursor cursor = sq.rawQuery(READ_HISTORY, null);
        if (cursor.moveToNext()) {
            do {
                History h = new History();
                h.setDuration(cursor.getString(1));
                h.setDrowsiness(cursor.getString(2));
                h.setChange(cursor.getString(3));
                h.setHands(cursor.getString(4));
                h.setEx_protein(cursor.getString(5));
                h.setUrinary(cursor.getString(6));
                h.setUrinary_color(cursor.getString(7));
                h.setUrinary_volume(cursor.getString(8));
                h.setHospital_history(cursor.getString(9));
                h.setDate(cursor.getString(10));

                list.add(h);
                historyAdapter = new HistoryAdapter(context, list);
                recyclerView.setAdapter(historyAdapter);


            }
            while (cursor.moveToNext());
        }
        cursor.close();
    }

    public void readPrevious(RecyclerView recyclerView) {


        SQLiteDatabase sq = this.getReadableDatabase();
        Cursor cursor = sq.rawQuery(READ_PREVIOUS, null);
        if (cursor.moveToNext()) {
            do {
                PreviousExperiments pe = new PreviousExperiments();
                pe.setDate(cursor.getString(1));
                pe.setResult(cursor.getString(2));
                pe.setNext(cursor.getString(3));
                pe.setReport(cursor.getString(4));
                previousExperimentsList.add(pe);
                previousExperimentsAdapter = new PreviousExperimentsAdapter(context, previousExperimentsList);
                recyclerView.setAdapter(previousExperimentsAdapter);
            }
            while (cursor.moveToNext());
        }
        cursor.close();
    }

    public void addPrevious(String date, String result, String next, String report) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put("date", date);
        values.put("result", result);
        values.put("next", next);
        values.put("report", report);

        db.insert(PREVIOUS_EXPERIMENTS, null, values);
        db.close();

    }

    public void addSonography(String date, String result, String next, String report) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put("date", date);
        values.put("result", result);
        values.put("next", next);
        values.put("report", report);

        db.insert(SONOGRAPHY, null, values);
        db.close();

    }

    public void readSonography(RecyclerView recyclerView) {


        SQLiteDatabase sq = this.getReadableDatabase();
        Cursor cursor = sq.rawQuery(READ_SONOGRAPHY, null);
        if (cursor.moveToNext()) {
            do {
                Sonography sonography = new Sonography();
                sonography.setDate(cursor.getString(1));
                sonography.setResult(cursor.getString(2));
                sonography.setNext(cursor.getString(3));
                sonography.setReport(cursor.getString(4));
                sonographyList.add(sonography);
                sonographyAdapter = new SonographyAdapter(context, sonographyList);
                recyclerView.setAdapter(sonographyAdapter);
            }
            while (cursor.moveToNext());

        }
        cursor.close();
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + USER);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + HISTORY);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + PREVIOUS_EXPERIMENTS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + SONOGRAPHY);
        onCreate(sqLiteDatabase);
    }
}
