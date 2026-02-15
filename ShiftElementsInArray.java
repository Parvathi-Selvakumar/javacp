
     void main(String[] args){
        int[] user = {10,20,30,40,50};
        int lenOne = user.length; //lenOne 5
        int[] ans = new int[lenOne - 1];
        int lenTwo = ans.length;//lenTwo 4
for(int iterateUser=1, iterateAns = 0 ; iterateAns<=lenTwo -1 || iterateUser<= lenOne-1; iterateUser++,iterateAns++ ){

         ans[iterateAns] = user[iterateUser];

        }
//to feed a value imto array in particular index
//ans[0] = 20;
//        ans[1] = 30;
//        ans[2]= 40;
        //to print value from array in a given index number
//        System.out.println(ans[0]);
//        System.out.println(ans[1]);
//        System.out.println(ans[2]);
        //to print values of array
        for(int i=0; i<lenTwo; i++)
        {
            System.out.print(ans[i] + " ");
        }
}


