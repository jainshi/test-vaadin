package com.jainshi.vaadintest.mvp.presenter;

import com.jainshi.vaadintest.mvp.view.SearchPartView;

public abstract class SearchPartPresenter<T> {

	private SearchPartView<T> view;

	public SearchPartView<T> getView() {
		return view;
	}

	public abstract SearchPartView<T> createSearchView();

	public void hideView() {
		view.hideAll();
	}

	public void unhideView() {
		view.unhideAll();
	}
}
