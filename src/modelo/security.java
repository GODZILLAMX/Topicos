/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 *
 * @author kevin
 */
public class security {
     public String decode(String s) throws UnsupportedEncodingException {
String respuesta = "error";
try {
respuesta = new String(Base64.getDecoder().decode(s.getBytes("UTF8")),"UTF-8");
} catch (UnsupportedEncodingException e) {
e.printStackTrace();
}
return respuesta;
}

public String encode(String s) {
String respuesta = "error";
try {
respuesta = new String(Base64.getEncoder().encode(s.getBytes("UTF8")),"UTF-8");
} catch (UnsupportedEncodingException e) {
e.printStackTrace();
}
return respuesta;
}
}
