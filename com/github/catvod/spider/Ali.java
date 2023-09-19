package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p046l.C0613e;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Ali extends Spider {

    /* renamed from: a */
    public static final Pattern f3a = Pattern.compile(atm.m897d("1D0D0D5B2D3403030F1B282A030C1F5B2F370755095A64033455275E6570451C1519283D1855522E12773751535C73"));

    public static Object[] proxy(Map<String, String> map) {
        if (map.get(atm.m897d("1E030A10")).equals(atm.m897d("190F18"))) {
            return C0613e.m236e().m221t(map);
        }
        return null;
    }

    public String detailContent(List<String> list) {
        String trim = list.get(0).trim();
        Matcher matcher = f3a.matcher(trim);
        if (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.groupCount() == 3 ? matcher.group(3) : "";
            C0613e.m236e().m220u(group);
            return C0308f.m888g(C0613e.m236e().m227n(trim, group2));
        }
        return "";
    }

    public void init(Context context, String str) {
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] split = str2.split(atm.m897d("3651"));
        if (str.equals(atm.m897d("8FF4E592D9F3"))) {
            C0613e m236e = C0613e.m236e();
            m236e.getClass();
            C0308f c0308f = new C0308f();
            c0308f.m880o(m236e.m235f(split[0]));
            c0308f.m881n(m236e.m229l(split));
            c0308f.m892c(m236e.m234g());
            return c0308f.toString();
        }
        return C0613e.m236e().m223r(split, str);
    }
}
