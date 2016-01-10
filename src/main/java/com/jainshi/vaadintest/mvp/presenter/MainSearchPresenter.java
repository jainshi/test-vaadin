package com.jainshi.vaadintest.mvp.presenter;

import com.jainshi.vaadintest.mvp.model.AssetSearchModel;
import com.jainshi.vaadintest.mvp.model.CollateralSearchModel;
import com.jainshi.vaadintest.mvp.model.CustomerSearchModel;
import com.jainshi.vaadintest.mvp.view.MainSearchView;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.Component;

public class MainSearchPresenter {

	private MainSearchView view;
	private SearchPartPresenter<?> currentSearch;

	private SearchPartPresenter<AssetSearchModel> assetSearch;
	private SearchPartPresenter<CustomerSearchModel> customerSearch;
	private SearchPartPresenter<CollateralSearchModel> collateralSearch;

	public void init() {

		assetSearch = new AssetSearchPartPresenter();

		view.addSearchTypeChangeBehavior(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				String type = view.getSearchType();
				if ("Asset".equalsIgnoreCase(type)) {
					currentSearch = assetSearch;
				} else if ("Customer".equalsIgnoreCase(type)) {
					currentSearch = customerSearch;
				} else {
					currentSearch = collateralSearch;
				}
				hideAll();
				currentSearch.unhideView();
			}
		});
		
		
	}

	private void hideAll() {
		assetSearch.hideView();
		customerSearch.hideView();
		collateralSearch.hideView();
	}

	private Component createPage() {
		return null;
	}
}
