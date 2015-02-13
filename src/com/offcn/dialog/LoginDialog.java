package com.offcn.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

public class LoginDialog {
	private Dialog dialog;
	public LoginDialog(Context context){
		dialog = new Dialog(context,R.style.MyDialog);
		dialog.setContentView(R.layout.activity_main);
		
		dialog.findViewById(R.id.dialog_button_cancel).setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				dialog.dismiss();
			}
		});
	}
	
	public void dismiss() {
        dialog.dismiss();
    }
    public void show() {
        dialog.show();
    }
    public void setOk( View.OnClickListener listener) {
        dialog.findViewById(R.id.dialog_button_ok).setOnClickListener(listener);
    }
}
