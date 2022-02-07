class frq2 { // creating LightSequence class
    public static void main(String[] args) {
        class LightSequence {
            String sequence; //create sequence variable

            public LightSequence(String sequence) { //calls this.sequence to LightSequence
                this.sequence = sequence;
            }

            public String insertSegment(String segment, int ind) { // create new class insertSegment
                StringBuilder sb = new StringBuilder(segment);
                sb.insert(ind, segment); //has str and int parameters
                return sb.toString();
            }

            public void changeSequence(String sequence) {
                this.sequence = sequence; //sets this.sequence to sequence
            }

            public void display() {
                System.out.println(sequence); //prints sequence
            }

        }
        LightSequence GradShow = new LightSequence("0101 0101 0101");

        GradShow.display();

        GradShow.changeSequence("0011 0011 0011");

        String resultSeq = GradShow.insertSegment("1111 1111", 4);

        System.out.println(resultSeq + "4");

        String oldSeq = "1100000111";
        String segment = "11";

        int index = oldSeq.indexOf(segment);

        String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());
        System.out.println(newSeq + "11");

        int a = 4;
        int b = 5;
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println(c);
    }
}