package com.learn.automation.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListeners implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("From Listener onStart:" + suite.getName());
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("From Listener onFinish:" + suite.getName());
	}

}
