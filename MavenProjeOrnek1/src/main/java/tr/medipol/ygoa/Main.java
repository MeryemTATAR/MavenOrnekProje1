package tr.medipol.ygoa;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("proje çalışıyor");
		String metin = "Y A Z I L I M";
		String sonuc = StringUtils.deleteWhitespace(metin);
		System.out.println(metin+"->"+sonuc);
	}

}
