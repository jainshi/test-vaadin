package com.jainshi.vaadintest.mvp.view;

import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;

public class MainSearchView {

	private ComboBox searchType;
	private SearchPartView<?> searchPart;
	private Button search;
	private Button select;
	private Button clear;
	
	public MainSearchView() {
		searchType = new ComboBox();
		search = new Button();
		select = new Button();
		clear = new Button();
	}
	
	public void addSearchTypeChangeBehavior(ValueChangeListener listener) {
		searchType.addValueChangeListener(listener);
	}
	
	public String getSearchType() {
		return (String)searchType.getValue();
	}
	
}
