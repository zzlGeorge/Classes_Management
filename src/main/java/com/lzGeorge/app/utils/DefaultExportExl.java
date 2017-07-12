package com.lzGeorge.app.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

/**
 * 1. 基本导出数据至Excel功能
 * 2. 根据需求导出各种样式的Excel
 */
public class DefaultExportExl {
    /**
     * @param data 此数据数组元素一定要自己构造JSONObject(true)，构造器内要加true，
     *             表示数据按顺序排序;否则就会自己构造JSONObject对象，乱序。
     */
    public static void export(String sheetName, String[] header, JSONArray data, FileOutputStream os) {
        exportExl(sheetName, header, data, os);
    }

    private static void exportExl(String sheetName, String[] header, JSONArray data, FileOutputStream os) {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet(sheetName);
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setWrapText(true);

        for (int i = 0; i < header.length; i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellValue(header[i]);
            cell.setCellStyle(style);
            sheet.autoSizeColumn(i);
            sheet.setColumnWidth(i, 100 * 35);
        }

        int index = 1;
        for (int i = 0; i < data.size(); i++) {
            row = sheet.createRow(index++);
            int colNum = 0;

            //JSONObject 依旧乱序 不要用data.getJSONObject(i)方法获取JSONObject对象
            JSONObject o = data.getJSONObject(i);

            Iterator iterator = o.values().iterator();
            while (iterator.hasNext()) {
                HSSFCell cell = row.createCell(colNum);
                String val = iterator.next().toString();
                cell.setCellStyle(style);
                cell.setCellValue(val);
                colNum++;
            }
            System.out.println();
            colNum = 0;
        }

        try {
            wb.write(os);
            os.close();
            System.out.println("OK!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {

        FileOutputStream os = new FileOutputStream(new File("D://cc.xls"));
        JSONObject[] object = new JSONObject[3];
        for (int i = 0; i < 3; i++) {
            object[i] = new JSONObject(true);
            object[i].put("a" + i, "msg" + i);
            object[i].put("b" + i, "sse" + i);
            object[i].put("c" + i, "cce" + i);
        }

        /*export("aa", new String[]{"A", "B", "C", "D"}, object, os);*/
    }

}
