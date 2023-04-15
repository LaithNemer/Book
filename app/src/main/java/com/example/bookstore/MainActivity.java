package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookDa;
import com.example.bookstore.model.BookFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void GetBooks(View view){
        BookFactory factory=new BookFactory();
        BookDa objBook=factory.getModel();
        List<Book> array=objBook.getBooks("java");
        String str="";
       for(Book b:array){
           str=str+b.getTitle();
       }
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();

    }
}