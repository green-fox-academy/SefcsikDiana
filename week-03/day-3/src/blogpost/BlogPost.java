package blogpost;

public class BlogPost {
  //  Create a BlogPost class that has
//      an authorName
  String authorName;
  //      a title
  String title;
  //      a text
  String text;
  //      a publicationDate
  String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }
}
