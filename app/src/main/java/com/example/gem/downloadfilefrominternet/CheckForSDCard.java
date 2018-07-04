package com.example.gem.downloadfilefrominternet;

import android.os.Environment;

/**
 * Created by gem on 7/4/18.
 */

public class CheckForSDCard {
  public boolean isSDCardPresent() {
    if (Environment.getExternalStorageState().equals(

        Environment.MEDIA_MOUNTED)) {
      return true;
    }
    return false;
  }
}
