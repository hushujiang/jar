package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p042j.C0574b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PanSearch extends Ali {
    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        HashMap hashMap = new HashMap();
        String m897d = atm.m897d("3F091F0761190D1F1401");
        String m897d2 = atm.m897d("2715001C20340B554F5B7C78422D131B28371D095A3B18785B4A544577783D13144378634A024C4165782B0A0A19290F0F18311C38775F494D5B7F6E4A52313D181526565A1925330F5A3D102F3305535A36242A05171F5A7D6853544A5B7C765A5A29142A39181355407F6F44494C");
        hashMap.put(m897d, m897d2);
        String m897d3 = atm.m897d("020E0E053F6245550D023B761A1B140629391819125B213D45");
        String str2 = atm.m897d("020E0E053F6245550D023B761A1B140629391819125B213D45251410342C451E1B012D77") + new JSONObject(C0052e.m1414e(C0574b.m307f(m897d3, hashMap, null)).m967p0(atm.m897d("1919081C3C2C31131E481307243F2221131C2B2E3B2A1305")).get(0).m985X()).getString(atm.m897d("080F131928110E")) + atm.m897d("45091F143E3B02541006233655111F0C3B37181E47") + URLEncoder.encode(str) + atm.m897d("4C0A1B1B713906130300223C18130C10");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(m897d, m897d2);
        hashMap2.put(atm.m897d("12571410342C000957112D2C0B"), atm.m897d("5B"));
        hashMap2.put(atm.m897d("181F1C103E3D18"), m897d3);
        JSONObject jSONObject = new JSONObject(C0574b.m307f(str2, hashMap2, null)).getJSONObject(atm.m897d("1A1B1D101C2A050A09"));
        String m897d4 = atm.m897d("0E1B0E14");
        JSONArray jSONArray = jSONObject.getJSONObject(m897d4).getJSONArray(m897d4);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String optString = jSONObject2.optString(atm.m897d("0915140129361E"));
            String[] split = optString.split(atm.m897d("3614"));
            if (split.length != 0) {
                arrayList.add(new C0310h(C0052e.m1414e(optString).m967p0(atm.m897d("0B")).m606a(atm.m897d("02081F13")), split[0].replaceAll(atm.m897d("5655452E1266375144"), ""), jSONObject2.optString(atm.m897d("03171B1229")), jSONObject2.optString(atm.m897d("1E131710"))));
            }
        }
        return C0308f.m887h(arrayList);
    }
}
