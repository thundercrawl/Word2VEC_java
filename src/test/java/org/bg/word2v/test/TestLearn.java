/*
 *----------------------------------------------------------------------------
 * BIGVISION Confidential
 *
 * OCO Source Materials
 *
 * (C) Copyright BIGVision Corp. 2019
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with
 * the U.S. Copyright Office.
 *
 * Source file, component, release :  %W%
 * Version:                           %R%.%L%.%B%.%S%
 * Last Changed:                      %G% at %U%
 *
 *----------------------------------------------------------------------------
 */
package org.bg.word2v.test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;


import com.ansj.vec.Learn;
import com.ansj.vec.Word2VEC;



import org.junit.Test;

public class TestLearn
{

   @Test
   public void testlearn_usingmodel() throws IOException
   {
    
      
      //加载测试
      
      Word2VEC w2v = new Word2VEC() ;
      
      w2v.loadJavaModel("models/model1") ;
      
      System.out.println(w2v.distance("台湾")); ;

  
   }
}


