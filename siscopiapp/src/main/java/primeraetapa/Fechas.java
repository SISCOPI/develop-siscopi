/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraetapa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Mary
 */
@ManagedBean
@RequestScoped
public class Fechas {
    private String isemestre;
    private String fsemestre;

    public String getIsemestreD() {
        SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy",Locale.ENGLISH);
        Date date;
        String date2;
        try {
            if(isemestre!=null){
            date = formatter.parse(this.isemestre);
//            System.out.println(date);
//            System.out.println(isemestre);
              Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
                System.out.println("formatedDate : " + formatedDate); 
                date2=formatedDate;
            }
            else{
                date2=null;
            }
        } catch (ParseException e) {
            date2=null;
            e.printStackTrace();
        }

        return date2;
    }
    public String getIsemestre() {
        return isemestre;
    }
    public void setIsemestre(String isemestre) {
        this.isemestre = isemestre;
    }

    public String getFsemestre() {
        return fsemestre;
    }

    public void setFsemestre(String fsemestre) {
        this.fsemestre = fsemestre;
    }
    
}
