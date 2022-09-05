package httpclient;//package httpclient;
//
//import org.testng.annotations.Test;
//import sun.nio.cs.StandardCharsets;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLConnection;
//
//@Test
//public class test001 {
//    String urlStr="https://www.cnblogs.com/whh012/";
////    统一资源定位符
//    URL url=new URL(urlStr);
//    //打开一个url链接
//    URLConnection urlConnection=url.openConnection();
////    强转一下，urlConnection转成HttpURLConnection
//    HttpURLConnection httpURLConnection=(HttpURLConnection)urlConnection;
////    获取httpURLConnection的输入流
//    try(
//            InputStream is=httpURLConnection.getInputStream();
//            InputStreamReader isr=new InputStreamReader(is, StandardCharsets.UTF_8);
//            BufferedReader br=new BufferedReader(isr);){
//        String line;
//        while (true) {
//            try {
//                if (!(line=br.readLine())) break;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }!=null){
//            System.out.println(line);
//        }
//
//    }
//}
