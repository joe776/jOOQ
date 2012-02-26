/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "v_book", schema = "public")
public class VBook implements java.io.Serializable {

	private static final long serialVersionUID = -1811610465;

	private java.lang.Integer                                         id;
	private java.lang.Integer                                         authorId;
	private java.lang.Integer                                         coAuthorId;
	private java.lang.Integer                                         detailsId;
	private java.lang.String                                          title;
	private java.lang.Integer                                         publishedIn;
	private java.lang.Integer                                         languageId;
	private java.lang.String                                          contentText;
	private byte[]                                                    contentPdf;
	private org.jooq.test.postgres.generatedclasses.enums.UBookStatus status;

	@javax.persistence.Column(name = "id")
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "author_id")
	public java.lang.Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(java.lang.Integer authorId) {
		this.authorId = authorId;
	}

	@javax.persistence.Column(name = "co_author_id")
	public java.lang.Integer getCoAuthorId() {
		return this.coAuthorId;
	}

	public void setCoAuthorId(java.lang.Integer coAuthorId) {
		this.coAuthorId = coAuthorId;
	}

	@javax.persistence.Column(name = "details_id")
	public java.lang.Integer getDetailsId() {
		return this.detailsId;
	}

	public void setDetailsId(java.lang.Integer detailsId) {
		this.detailsId = detailsId;
	}

	@javax.persistence.Column(name = "title")
	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	@javax.persistence.Column(name = "published_in")
	public java.lang.Integer getPublishedIn() {
		return this.publishedIn;
	}

	public void setPublishedIn(java.lang.Integer publishedIn) {
		this.publishedIn = publishedIn;
	}

	@javax.persistence.Column(name = "language_id")
	public java.lang.Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(java.lang.Integer languageId) {
		this.languageId = languageId;
	}

	@javax.persistence.Column(name = "content_text")
	public java.lang.String getContentText() {
		return this.contentText;
	}

	public void setContentText(java.lang.String contentText) {
		this.contentText = contentText;
	}

	@javax.persistence.Column(name = "content_pdf")
	public byte[] getContentPdf() {
		return this.contentPdf;
	}

	public void setContentPdf(byte[] contentPdf) {
		this.contentPdf = contentPdf;
	}

	@javax.persistence.Column(name = "status")
	public org.jooq.test.postgres.generatedclasses.enums.UBookStatus getStatus() {
		return this.status;
	}

	public void setStatus(org.jooq.test.postgres.generatedclasses.enums.UBookStatus status) {
		this.status = status;
	}
}
