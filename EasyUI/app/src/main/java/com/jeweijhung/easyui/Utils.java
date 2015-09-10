package com.jeweijhung.easyui;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能性method
 * Created by je-weijhung on 8/31/15.
 */
public class Utils {

    public static void writeFile(Context context, String fileName, String text) {
        try {
            FileOutputStream fos = context.openFileOutput(fileName, Context.MODE_APPEND); //串流 通道
            fos.write(text.getBytes());
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String readFile(Context context, String fileName) {
        try {
            FileInputStream fis = context.openFileInput(fileName);
            byte[] buffer = new byte[1024];
            fis.read(buffer); //直接讀取是不好的 因為無法正確計算byte

            return new String(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}
