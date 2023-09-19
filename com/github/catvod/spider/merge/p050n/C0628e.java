package com.github.catvod.spider.merge.p050n;

import com.github.catvod.spider.merge.atm;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/* renamed from: com.github.catvod.spider.merge.n.e */
/* loaded from: classes.dex */
final class C0628e extends C0625b {

    /* renamed from: b */
    final Map f1200b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0628e(Map map) {
        this.f1200b = map;
    }

    @Override // com.github.catvod.spider.merge.p050n.C0625b, com.github.catvod.spider.merge.p050n.AbstractC0626c
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ String mo186d(Call call, Response response) {
        String m897d = atm.m897d("B1D2A1ED97C0B1D8A1EF97FFB1DCA1D597CEB1DAA1EE97C0B1E2A1D197CEB1DB");
        while (true) {
            switch ((m897d.hashCode() ^ 670) ^ (-1171099645)) {
                case -1929853129:
                    return mo185h(response);
                case -1272452318:
                    m897d = atm.m897d("B1D2A1DE97CEB1EDA1EE97F8B1DBA1D497C2B1E5A1E297FCB1E1A1D797CEB1E2A1EA97F4B1DD");
                    break;
                case -566970817:
                    m897d = atm.m897d("B1E0A1D997C4B1DEA1E397C4B1DCA1DE97FFB1ECA1EE97F9B1E2A1D597C3B1D6A1DE97CEB1D6A1ED97F4B1D2A1EF97F8B1DBA1D597C2B1E3");
                    break;
                case -506551829:
                    m897d = atm.m897d("B1D6A1D097C3B1DCA1ED97C1B1DCA1D997C7B1DDA1EA97F9B1D2A1D097F0B1E2");
                    break;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.p050n.C0625b
    /* renamed from: h */
    public final String mo185h(Response response) {
        try {
            Map map = this.f1200b;
            String m897d = atm.m897d("B1E2A1D497F9B1E2A1DD97CEB1DBA1D297FEB1D2A1ED97F8B1DFA1DD97FCB1D1A1D497C0B1D6A1D097FFB1E2");
            while (true) {
                switch (m897d.hashCode() ^ 1435011274) {
                    case -1731505405:
                        if (map == null) {
                            m897d = atm.m897d("B1E3A1D297FDB1E2A1D597CFB1DFA1E397F3B1D2A1D497CEB1DCA1EC97F9B1E6A1ED97C2B1EDA1D097C0");
                            break;
                        } else {
                            m897d = atm.m897d("B1DFA1DE97C1B1DDA1DD97FDB1DEA1D397C0B1DBA1ED97FAB1E2A1D797C4B1E2A1D597C7B1E6A1ED97F8B1E3A1ED97C4B1E2A1D0");
                            break;
                        }
                    case -1342252825:
                        map.clear();
                        this.f1200b.putAll(response.headers().toMultimap());
                        break;
                    case -421157131:
                        break;
                    case 1673531963:
                        m897d = atm.m897d("B1D8A1DD97C4B1E2A1D797CEB1DFA1ED97FFB1E6A1D397FDB1D8A1D497C0B1E5A1ED97FA");
                        break;
                }
            }
            return response.body().string();
        } catch (IOException e) {
            return "";
        }
    }
}
