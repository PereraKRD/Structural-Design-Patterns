public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        LoadImage(this.fileName);
    }

    @Override
    public void display(){
        System.out.println("Displaying : " + fileName);
    }

    private void LoadImage(String fileName){
        System.out.println("Loading : " + fileName);
    }
}
