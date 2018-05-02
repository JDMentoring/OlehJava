package homeWork4;

public class Book {
    private String title;
    private String author;
    private  String janre;
    private Paper paper;
    private PublishingHouse pubHouse;


    public Book() {
    title = "no title";
    author = "no author";
    janre = "no janre";
    paper = new Paper();
    pubHouse = new PublishingHouse();
    }

    public Book(String title,String author,String janre, Paper paper,PublishingHouse pubHouse) {
        setTitle(title);
        setAuthor(author);
        setJanre(janre);
        setPaper(paper);
        setPubHouse(pubHouse);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getJanre() {
        return janre;
    }

    public void setJanre(String janre) {
        this.janre = janre;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public PublishingHouse getPubHouse() {
        return pubHouse;
    }

    public void setPubHouse(PublishingHouse pubHouse) {
        this.pubHouse = pubHouse;
    }
    public void geiAllInfo(){
        System.out.println("Назва книги:"+title+ "Автор книги :"+author+ "Жанр:"+janre+ "Видавництво:"+pubHouse.getName()+
                            "Адреса видавництва:"+pubHouse.getAdress()+ "Номер телефону:"+pubHouse.getNumber() +
                            "Тип паперу:"+paper.getType()+ "Щільність:"+paper.getDensity()+
                "гр/м2 Білизна паперу:"+paper.getWhiteness());
    }
}
