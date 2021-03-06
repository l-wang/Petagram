package databeans.instagram;

public class UserInfoResponse {
	public UserInfo data;

	public static class UserInfo {
		public String id;
		public String username;
		public String full_name;
		public String profile_picture;
		public String bio;
		public String website;
		public Counts counts;
	}

	public static class Counts {
		public long media;
		public long follows;
		public long followed_by;
	}
}
