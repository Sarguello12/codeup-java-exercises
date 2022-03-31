class Post {
    public String author;
    public String title;
    public String content;
    public String creationDate;

    public String getPost() {
        return "\nTitle: " + title + "\n" +
                "Content: " + content + "\n" +
                "Author: " + author + "\n" +
                "Date: " + creationDate + "\n";
    }

    public String updatePost(String title, String author, String content, String creationDate){
        this.title = title;
        this.author = author;
        this.content = content;
        this.creationDate = creationDate;

        return  this.getPost();
    }

}



public class OOPLecture {
    public static void main(String[] args){
//        Post firstPost = new Post();
//
//        firstPost.author = "Sam Arguello";
//        firstPost.title = "Carp fishing is rad!";
//        firstPost.creationDate = "03/31";
//        firstPost.content = "Carp are americas finest sport fish and available to catch anywhere!";
//
//
//        System.out.println("firstPost = " + firstPost.getPost());
//
//        Post secondPost = new Post();
//
//        secondPost.updatePost(
//                "Bass fishing is overrated",
//                "Sam Arguello",
//                "They dont even fight that hard.",
//                "03/31");
//
//        System.out.println(secondPost.getPost());



    }
}
