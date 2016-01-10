package com.jainshi.vaadintest.mvp.view;

import com.jainshi.vaadintest.MyTable;
import com.jainshi.vaadintest.mvp.model.AssetSearchModel;
import com.vaadin.ui.TextField;

public abstract class SearchPartView<M> {

	private TextField searchInput;
	private MyTable<AssetSearchModel> searchResult;

	public void hideAll() {
		searchInput.setVisible(false);
		searchResult.setVisible(false);
	}

	public void unhideAll() {
		searchInput.setVisible(true);
		searchResult.setVisible(true);
	}

	public String getSearchInput() {
		return (String) searchInput.getValue();
	}

	@SuppressWarnings("unchecked")
	public M getSelectedRow() {
		return (M) searchResult.getValue();
	}

	protected abstract void constructTable();
	
}
