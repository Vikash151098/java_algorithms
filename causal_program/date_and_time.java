
// package causal_program;

// import java.util.Date;

// /**
// * date_and_time
// */
// public class date_and_time {
// public static void main(String[] args) {

// Date dt = new Date();
// System.out.println("timezone offset: " + dt.getTimezoneOffset());
// System.out.println("date utc: " + dt.toString());
// System.out.println("date epoch: " + dt.getTime());

// long d = dt.getTime() + dt.getTimezoneOffset() * 60 * 1000;
// dt.setTime(d);
// System.out.println("date utc: " + dt.toString());
// System.out.println("date new epoch: " + dt.getTime());
// }
// }