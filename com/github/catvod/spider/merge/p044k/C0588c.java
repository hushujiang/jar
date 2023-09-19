package com.github.catvod.spider.merge.p044k;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import java.util.Comparator;
import org.json.JSONException;

/* renamed from: com.github.catvod.spider.merge.k.c */
/* loaded from: classes.dex */
final class C0588c implements Comparator<String> {

    /* renamed from: a */
    final C0589d f1064a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0588c(C0589d c0589d) {
        this.f1064a = c0589d;
    }

    @Override // java.util.Comparator
    public final int compare(String str, String str2) {
        String str3 = str2;
        try {
            int i = C0589d.m292b(this.f1064a).getJSONObject(str).getInt(C0052e.m1418a(new byte[]{-122, -11}, new byte[]{-23, -121, 90, -102, 30, 17, 103, -82}));
            int i2 = C0589d.m292b(this.f1064a).getJSONObject(str3).getInt(C0052e.m1418a(new byte[]{-67, -22}, new byte[]{-46, -104, -75, -121, -42, -119, 100, 40}));
            String m897d = atm.m897d("B1EDA1EA97CFB1DAA1E297CEB1E2A1D397C2B1D8A1D797FCB1DEA1D397F3B1ECA1ED97F8B1DAA1EE97F3B1DAA1ED97C0B1DDA1D397FA");
            while (true) {
                switch (m897d.hashCode() ^ (-1008069859)) {
                    case -483194677:
                        if (i != i2) {
                            m897d = atm.m897d("B1E1A1E297CFB1DBA1ED97C2B1E2A1D397C7B1E5A1DD97F0B1E3A1EC97F0B1ECA1D597CEB1E2A1D197FFB1DDA1DE97FDB1E1A1D197C7B1E6A1ED");
                            break;
                        } else {
                            m897d = atm.m897d("B1DFA1E997F9B1E2A1D497FCB1DDA1E297F8B1DBA1EF97C0B1DCA1D497C0B1E2A1EE97C3B1D2A1DD97F9B1D8");
                            break;
                        }
                    case -187309872:
                        return 1;
                    case 63978689:
                        m897d = atm.m897d("B1E3A1EF97FCB1E3A1EF97FDB1E5A1DE97CEB1DCA1EA97C2B1ECA1D197F4B1DDA1ED97C2B1E6A1D397F4B1DBA1E397F9");
                        break;
                    case 901939215:
                        String m897d2 = atm.m897d("B1DBA1D397FDB1E2A1EC97FDB1E6A1D497C0B1E3A1DE97FCB1D2A1ED97C2B1DFA1D397C0B1D2A1D397F0B1E2A1DD97FCB1E0A1D297FDB1DBA1ED97C0B1EDA1EC");
                        while (true) {
                            switch (m897d2.hashCode() ^ 842780708) {
                                case -1758704211:
                                    m897d2 = atm.m897d("B1ECA1EA97F4B1ECA1E397FFB1E2A1EA97F3B1D8A1ED97F8B1ECA1EE97C1B1ECA1D297FDB1DDA1ED97CEB1D8A1ED97C0");
                                    break;
                                case 419883649:
                                    if (i - i2 <= 0) {
                                        m897d2 = atm.m897d("B1E6A1E397F3B1DFA1EA97FEB1E2A1ED97C1B1DFA1ED97F4B1D8A1E997C0B1EDA1D097FDB1E2A1DE97C3B1DCA1D397C1B1E3");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1DDA1EC97FFB1E2A1DD97CFB1DCA1D497F4B1E2A1E397CEB1E0A1E297F8B1E6A1EE97F8B1DCA1ED");
                                        break;
                                    }
                                case 1724232803:
                                    return 1;
                                case 2120323408:
                                    return -1;
                            }
                        }
                        break;
                }
            }
        } catch (JSONException e) {
            SpiderDebug.log(e);
            return 1;
        }
    }
}
