package treeset;

import collection.hashmap.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(300, "Lee");
		Member memberKim = new Member(120, "Kim");
		Member memberPark = new Member(200, "Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();
		

	}

}
