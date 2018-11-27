public class JackOLanternRunner {
    public static void main(String[] args){
        String[][] face = new String [5][8];
        JackOLantern face1 = new JackOLantern(face);

        face1.fill("X");
        face1.edit(" ",0,0);
        face1.edit(" ",4,7);
        face1.edit(" ",0,7);
        face1.edit(" ",4,0);

        face1.edit("0",1,2);
        face1.edit("0",1,5);
        face1.edit("^",2,3);
        face1.edit("^",2,4);
        face1.edit("|",3,1);
        face1.edit("|",3,2);
        face1.edit("_",3,3);
        face1.edit("_",3,4);
        face1.edit("|",3,5);
        face1.edit("|",3,6);
        System.out.println(face1);

        String[][] sndface = new String [7][8];
        JackOLantern face2 = new JackOLantern(sndface);

        face2.fill("*");

        for(int i =0; i< 2; i++){
            for(int j = 0; j<face[i].length; j++){
                face2.edit(" ", i, j);
            }
        }

        face2.edit("(",1,4);
        face2.edit(")",1,3);
        face2.edit("_",0,4);
        face2.edit("_",0,3);

        face2.edit("Q",1,1);
        face2.edit("~",1,2);

        face2.edit(" ",2,0);
        face2.edit(" ",6,7);
        face2.edit(" ",2,7);
        face2.edit(" ",6,0);

        face2.edit("X",3,2);
        face2.edit("X",3,5);
        face2.edit("o",4,3);
        face2.edit("o",4,4);
        face2.edit(")",5,1);
        face2.edit("^",5,2);
        face2.edit("-",5,3);
        face2.edit("-",5,4);
        face2.edit("^",5,5);
        face2.edit("(",5,6);
        System.out.println(face2);
    }
}
