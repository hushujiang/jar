package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p055q.C0652d;
import com.google.gson.Gson;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class XPathMac extends XPath {

    /* renamed from: c */
    private boolean f31c;

    /* renamed from: d */
    private boolean f32d;

    /* renamed from: e */
    private String f33e = "";

    /* renamed from: f */
    private String f34f = atm.m897d("31262D09100B1654275F73150B192A192D210F08391A223E031D54052039131F082A2031190E21291B243629065B11725547522E100F162629096205404553590139092A1614353D1839151B2A310D541E1A3B360F082519252B1E");

    /* renamed from: g */
    private final HashMap<String, String> f35g = new HashMap<>();

    @Override // com.github.catvod.spider.XPath
    /* renamed from: d */
    protected final void mo1523d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f31c = jSONObject.optBoolean(atm.m897d("0E192A192D213F0816"), false);
            this.f32d = jSONObject.optBoolean(atm.m897d("0E192C1C3C1E061B1D"), false);
            JSONObject optJSONObject = jSONObject.optJSONObject(atm.m897d("0E19291D232F582C1305"));
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f35g.put(next.trim(), optJSONObject.getString(next).trim());
                }
            }
            this.f33e = jSONObject.optString(atm.m897d("1A391C12062B")).trim();
            this.f34f = jSONObject.optString(atm.m897d("1A391C12062B38"), this.f34f).trim();
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    @Override // com.github.catvod.spider.XPath
    public String detailContent(List<String> list) {
        String m897d = atm.m897d("1C151E2A3C340B0325133E3707");
        String m897d2 = atm.m897d("06130901");
        String detailContent = super.detailContent(list);
        if (!this.f32d || detailContent.length() <= 0) {
            return detailContent;
        }
        try {
            JSONObject jSONObject = new JSONObject(detailContent);
            String[] split = jSONObject.optJSONArray(m897d2).getJSONObject(0).optString(m897d).split(atm.m897d("365E2651107C"));
            if (split.length > 0) {
                for (int i = 0; i < split.length; i++) {
                    if (this.f35g.containsKey(split[i])) {
                        split[i] = this.f35g.get(split[i]);
                    }
                }
                jSONObject.optJSONArray(m897d2).getJSONObject(0).put(m897d, TextUtils.join(atm.m897d("4E5E5E"), split));
                return jSONObject.toString();
            }
            return detailContent;
        } catch (Throwable th) {
            SpiderDebug.log(th);
            return detailContent;
        }
    }

    @Override // com.github.catvod.spider.XPath
    public String homeContent(boolean z) {
        String homeContent = super.homeContent(z);
        if (homeContent.length() > 0 && this.f33e.length() > 0) {
            Matcher matcher = Pattern.compile(this.f34f).matcher(m1525b(this.f33e));
            if (matcher.find()) {
                try {
                    JSONObject jSONObject = new JSONObject(matcher.group(1));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject optJSONObject = jSONObject.optJSONObject(next);
                        if (optJSONObject != null) {
                            String trim = optJSONObject.optString(atm.m897d("19121502")).trim();
                            if (!trim.isEmpty()) {
                                this.f35g.put(trim, next);
                            }
                        }
                    }
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
        }
        return homeContent;
    }

    @Override // com.github.catvod.spider.XPath
    public void init(Context context, String str) {
        super.init(context, str);
    }

    @Override // com.github.catvod.spider.XPath
    public String playerContent(String str, String str2, List<String> list) {
        String decode;
        String m897d = atm.m897d("0F14190735281E");
        m1524c();
        String replace = this.f30b.m350j0().isEmpty() ? str2 : this.f30b.m350j0().replace(atm.m897d("110A1614350D181607"), str2);
        String str3 = null;
        boolean z = this.f31c;
        String m897d2 = atm.m897d("1F0816");
        if (z) {
            try {
                C0459g m967p0 = C0052e.m1414e(m1525b(replace)).m967p0(atm.m897d("1919081C3C2C"));
                int i = 0;
                while (true) {
                    if (i >= m967p0.size()) {
                        break;
                    }
                    String trim = m967p0.get(i).m979d0().trim();
                    if (trim.startsWith(atm.m897d("1C1B08553C340B031F0713"))) {
                        JSONObject jSONObject = new JSONObject(trim.substring(trim.indexOf(123), trim.lastIndexOf(125) + 1));
                        String string = jSONObject.getString(m897d2);
                        if (jSONObject.has(m897d)) {
                            int i2 = jSONObject.getInt(m897d);
                            if (i2 == 1) {
                                decode = URLDecoder.decode(string);
                            } else if (i2 == 2) {
                                decode = URLDecoder.decode(new String(Base64.decode(string, 0)));
                            }
                            str3 = decode;
                        }
                        str3 = string;
                    } else {
                        i++;
                    }
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        if (str3 != null) {
            boolean z2 = this.f32d;
            String m897d3 = atm.m897d("1A1B080629");
            try {
                if (z2 && C0652d.m142i(str3)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(m897d3, 1);
                    jSONObject2.put(atm.m897d("0002"), atm.m897d("5B"));
                    jSONObject2.put(m897d2, str3);
                    return jSONObject2.toString();
                }
                boolean z3 = this.f32d;
                String m897d4 = atm.m897d("021F1B11292A");
                String m897d5 = atm.m897d("1A161B0C192A06");
                if (z3 && list.contains(str)) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(m897d3, 1);
                    jSONObject3.put(m897d5, "");
                    jSONObject3.put(m897d2, str3);
                    jSONObject3.put(m897d4, "");
                    return jSONObject3.toString();
                } else if (isVideoFormat(str3)) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(m897d3, 0);
                    jSONObject4.put(m897d5, "");
                    jSONObject4.put(m897d2, str3);
                    HashMap hashMap = new HashMap();
                    if (this.f30b.m352i0().length() > 0) {
                        hashMap.put(atm.m897d("3F091F0761190D1F1401"), this.f30b.m352i0());
                    }
                    if (this.f30b.m354h0().length() > 0) {
                        hashMap.put(atm.m897d("381F1C103E3D18"), this.f30b.m354h0());
                    }
                    jSONObject4.put(m897d4, new Gson().toJson(hashMap));
                    return jSONObject4.toString();
                }
            } catch (Exception e2) {
                SpiderDebug.log(e2);
            }
        }
        return super.playerContent(str, str2, list);
    }
}
