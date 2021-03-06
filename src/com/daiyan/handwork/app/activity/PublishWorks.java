package com.daiyan.handwork.app.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.daiyan.handwork.R;
import com.daiyan.handwork.app.BaseActivity;

/**
 * 发表作品提示页面
 * @author 魏工
 * @Date 2015年05月09日
 */
public class PublishWorks extends BaseActivity implements OnClickListener{

	private ImageView mTitleLeftBtn;
	private TextView mTitleTextView;
	private TextView mTitleRightTextView;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.activity_publish_works);
		
		initView();
	}

	/**
	 * 初始化界面
	 */
	private void initView() {
		initTitleBar();
	}

	/**
	 * 初始化标题栏
	 */
	private void initTitleBar() {
		mTitleLeftBtn = (ImageView) findViewById(R.id.id_ib_title_left);
		mTitleLeftBtn.setImageResource(R.drawable.icon_back);
		mTitleLeftBtn.setOnClickListener(this);
		mTitleTextView = (TextView) findViewById(R.id.id_tv_title_center);
		mTitleTextView.setText(getResources().getString(R.string.publish_works_title));
		mTitleRightTextView = (TextView) findViewById(R.id.id_tv_title_right);
		mTitleRightTextView.setVisibility(View.GONE);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.id_ib_title_left:
			finish();
			break;
		}
		
	}
	
}