package berandakreasitek.analogger;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;


public class NewLog extends AppCompatActivity implements OnItemSelectedListener{
Spinner s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_log);
        s1 = (Spinner)findViewById(R.id.filmBrandListDD);
        s2 = (Spinner)findViewById(R.id.filmTypeListDD);
        s1.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                               long arg3) {
        // TODO Auto-generated method stub
        String sp1 = String.valueOf(s1.getSelectedItem());
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
        if(sp1.contentEquals("Agfa")) {
            List<String> list = new ArrayList<String>();
            list.add("APX");
            list.add("Vista");
            list.add("Ultra Color");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
        }
        if(sp1.contentEquals("Fomapan")) {
            List<String> list = new ArrayList<String>();
            list.add("Action");
            list.add("Classic");
            list.add("Creative");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("Fuji")) {
            List<String> list = new ArrayList<String>();
            list.add("Astia");
            list.add("FP");
            list.add("Industrial");
            list.add("Neopan");
            list.add("Provia");
            list.add("Superia");
            list.add("Velvia");
            ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter3.notifyDataSetChanged();
            s2.setAdapter(dataAdapter3);
        }
        if(sp1.contentEquals("Ilford")) {
            List<String> list = new ArrayList<String>();
            list.add("Delta");
            list.add("FP4");
            list.add("HP5");
            list.add("HPS");
            list.add("Pan F");
            list.add("XP2");
            ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter4.notifyDataSetChanged();
            s2.setAdapter(dataAdapter4);
        }
        if(sp1.contentEquals("JCH")) {
            List<String> list = new ArrayList<String>();
            list.add("Street Pan");
            ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter5.notifyDataSetChanged();
            s2.setAdapter(dataAdapter5);
        }
        if(sp1.contentEquals("Kodak")) {
            List<String> list = new ArrayList<String>();
            list.add("BW");
            list.add("Ektachrome");
            list.add("Ektar");
            list.add("Elite");
            list.add("Gold");
            list.add("Kodachrome");
            list.add("Max");
            list.add("Portra");
            list.add("Pro Image");
            list.add("TMax");
            list.add("Tri-X");
            ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter6.notifyDataSetChanged();
            s2.setAdapter(dataAdapter6);
        }
        if(sp1.contentEquals("Lomography")) {
            List<String> list = new ArrayList<String>();
            list.add("Redscale");
            list.add("XPro");
            ArrayAdapter<String> dataAdapter7 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter7.notifyDataSetChanged();
            s2.setAdapter(dataAdapter7);
        }
        if(sp1.contentEquals("Rollei")) {
            List<String> list = new ArrayList<String>();
            list.add("IR");
            list.add("Ortho");
            list.add("Retro");
            ArrayAdapter<String> dataAdapter8 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter8.notifyDataSetChanged();
            s2.setAdapter(dataAdapter8);
        }
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

    public void cancelNewLog(View view){
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);
    }


    /*Spinner filmBrandList = (Spinner) findViewById(R.id.filmBrandListDD);
        filmBrandList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener())

    {
        public void onItemSelected (AdapterView < ? > parent, View view,int pos, long id){
        Object Obj = parent.getItemAtPosition(pos);
        String str = Obj.toString();
        Log.i(str, str);
    }
    }*/

    /***public void submitOrder(View view) {
        display(1);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.newFilmName);
        quantityTextView.setText("" + number);
    }***/



}
