package com.example.xml_parsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class MainActivity extends AppCompatActivity {
    TextView resxml,resjson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resxml=findViewById(R.id.resxml);
        resjson=findViewById(R.id.resjson);
    }

    public void XMLParser(View v)
    {
        try{
            InputStream is=getAssets().open("data.xml");
            DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder=dbFactory.newDocumentBuilder();
            Document doc=dbBuilder.parse(is);
            Element element=doc.getDocumentElement();
            element.normalize();
            NodeList nList=doc.getElementsByTagName("place");
            resxml.setText("XML DATA");
            for(int i=0;i<nList.getLength();i++)
            {
                Node node=nList.item(i);
                if(node.getNodeType()== Node.ELEMENT_NODE)
                {
                    Element element2=(Element) node;
                    resxml.setText(resxml.getText()+"\nCity_Name:"+getValue("cityname",element2)+"\n");
                    resxml.setText(resxml.getText()+"\nLatitude:"+getValue("latitude",element2)+"\n");
                    resxml.setText(resxml.getText()+"\nLongitude:"+getValue("longitude",element2)+"\n");
                    resxml.setText(resxml.getText()+"\nTemperature:"+getValue("temperature",element2)+"\n");
                    resxml.setText(resxml.getText()+"\nHumidity:"+getValue("humidity",element2)+"\n");
                    resxml.setText(resxml.getText()+"\n--------------------");
                }
            }
        } catch (IOException | ParserConfigurationException | SAXException e)
        {
            e.printStackTrace();
        }
    }
    private static String getValue(String tagname, Element element)
    {
        NodeList nodeList=element.getElementsByTagName(tagname).item(0).getChildNodes();
        Node node=nodeList.item(0);
        return node.getNodeValue();
    }
    public void JSONParser(View v)
    {
        String json;
        try {
            InputStream is = getAssets().open("data.json");
            int size=is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json=new String(buffer,"UTF-8");
            JSONArray jsonArray=new JSONArray(json);
            resjson.setText("JSON DATA");
            for(int i=0;i<jsonArray.length();i++)
            {
                JSONObject obj = jsonArray.getJSONObject(i);
                resjson.setText(resjson.getText()+"\nCity_Name:"+obj.getString("name")+"\n");
                resjson.setText(resjson.getText()+"\nLatitude:"+obj.getString("latitude")+"\n");
                resjson.setText(resjson.getText()+"\nLongitude:"+obj.getString("longitude")+"\n");
                resjson.setText(resjson.getText()+"\nTemperature:"+obj.getString("temperature")+"\n");
                resjson.setText(resjson.getText()+"\nHumidity:"+obj.getString("humidity")+"\n");
                resjson.setText(resjson.getText()+"\n--------------------");
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}