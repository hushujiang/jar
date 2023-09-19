package com.github.catvod.spider;

import com.github.catvod.spider.merge.atm;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class XPathFilter extends XPath {
    @Override // com.github.catvod.spider.XPath
    /* renamed from: a */
    protected final String mo1522a(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m353i = this.f30b.m353i();
        String m897d = atm.m897d("17");
        String m897d2 = atm.m897d("11");
        if (z && hashMap != null && hashMap.size() > 0) {
            for (String str3 : hashMap.keySet()) {
                String str4 = hashMap.get(str3);
                if (str4.length() > 0) {
                    m353i = m353i.replace(m897d2 + str3 + m897d, URLEncoder.encode(str4));
                }
            }
        }
        String replace = m353i.replace(atm.m897d("11191B0129110E07"), str).replace(atm.m897d("11191B0129080D07"), str2);
        Matcher matcher = Pattern.compile(atm.m897d("3601525B6667432607")).matcher(replace);
        while (matcher.find()) {
            String replace2 = matcher.group(0).replace(m897d2, "").replace(m897d, "");
            String replace3 = replace.replace(matcher.group(0), "");
            StringBuilder sb = new StringBuilder();
            String m897d3 = atm.m897d("45");
            sb.append(m897d3);
            sb.append(replace2);
            sb.append(m897d3);
            replace = replace3.replace(sb.toString(), "");
        }
        return replace;
    }

    @Override // com.github.catvod.spider.XPath
    /* renamed from: d */
    protected final void mo1523d(String str) {
    }
}
