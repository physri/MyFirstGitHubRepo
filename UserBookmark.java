package com.semanticsquare.thrillio.entities;

public class UserBookmark {
	private User user;
	private Bookmark bookmark;

	protected User getUser() {
		return user;
	}

	protected void setUser(User user) {
		this.user = user;
	}

	protected Bookmark getBookmark() {
		return bookmark;
	}

	protected void setBookmark(Bookmark bookmark) {
		this.bookmark = bookmark;
	}

}
