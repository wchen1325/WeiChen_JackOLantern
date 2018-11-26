public class JackOLantern {
    private String[][] face;

    public JackOLantern (String[][] face){
        this.face = face;
    }
    public void fill(String str){
        for(int i =0; i< face.length; i++){
            for(int j = 0; j<face[i].length; j++){
                face[i][j] = str;
            }
        }
    }

    public void edit (String str,int row, int column){
        face[row][column] = str;
    }
}




