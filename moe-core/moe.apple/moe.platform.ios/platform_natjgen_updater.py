#!/usr/bin/env python3
# This script gathers all iOS framework header files and update the platform.natjgen file
import json
import os
from typing import List, Set, Dict


class FrameworkOverride:
    def __init__(self,
                 name: str,
                 include_all_headers: bool = False,
                 exclude_default_header: bool = False,
                 include_headers: List[str] = None,
                 exclude_headers: List[str] = None,
                 ):
        self.name = name
        self.include_all_headers = include_all_headers
        self.include_headers = include_headers

        self._default_header_name = f'{name}.h'

        if exclude_default_header:
            if exclude_headers:
                self.exclude_headers = exclude_headers + [self._default_header_name]
            else:
                self.exclude_headers = [self._default_header_name]
        else:
            self.exclude_headers = exclude_headers

    def is_header_allowed(self, header: str) -> bool:
        if self.exclude_headers and header in self.exclude_headers:
            return False

        if (self.include_headers and header in self.include_headers) \
                or (self.include_all_headers and header.endswith('.h')) \
                or header == self._default_header_name:
            return True

        return False


OVERRIDES: Dict[str, FrameworkOverride] = {
    'objc': FrameworkOverride('objc', include_headers=['objc.h']),
    'dispatch': FrameworkOverride('dispatch', include_headers=['dispatch.h']),
    'CoreAudio': FrameworkOverride('CoreAudio', include_all_headers=True),
    'CoreServices': FrameworkOverride('CoreServices', exclude_default_header=True),
    'CoreTelephony': FrameworkOverride('CoreTelephony', include_all_headers=True),
    'IOSurface': FrameworkOverride('IOSurface', include_headers=['IOSurfaceObjC.h']),
    'OpenGLES': FrameworkOverride('OpenGLES',
                                  include_headers=['EAGLDrawable.h', 'OpenGLES_ES1_Defines.h', 'OpenGLES_ES2_Defines.h',
                                                   'OpenGLES_ES3_Defines.h']),
    'SceneKit': FrameworkOverride('SceneKit', include_headers=['ModelIO.h']),
    'Security': FrameworkOverride('Security', include_headers=['CipherSuite.h', 'SecureTransport.h']),
    'SystemConfiguration': FrameworkOverride('SystemConfiguration',
                                             include_headers=['CaptiveNetwork.h', 'DHCPClientPreferences.h']),
}


def load_existing_headers() -> List[str]:
    with open('platform.natjgen') as f:
        source: str = json.load(f)['source']
    lines = source.splitlines()
    imports = [i for i in lines if i.startswith('#import <')]
    headers = [i.strip()[len('#import <'): -1] for i in imports]

    headers.sort()

    return headers


def scan_headers(framework_path: str) -> List[str]:
    frameworks = [f for f in os.listdir(framework_path) if
                  os.path.isdir(os.path.join(framework_path, f)) and f.endswith('.framework')]

    all_headers: Set[str] = set()

    for f in frameworks:
        (name, _) = os.path.splitext(f)

        header_path = os.path.join(framework_path, f, 'Headers')
        if not os.path.exists(header_path) or not os.path.isdir(header_path):
            continue

        if name not in OVERRIDES:
            OVERRIDES[name] = FrameworkOverride(name)

        override = OVERRIDES[name]

        headers = [f'{name}/{h}' for h in os.listdir(header_path) if
                   os.path.isfile(os.path.join(header_path, h)) and override.is_header_allowed(h)]

        if not headers and not override.include_headers and not override.exclude_headers:
            print(f'Warn: {name}.framework has no header file included')

        all_headers |= set(headers)

    # Add extra headers
    for (name, override) in OVERRIDES.items():
        if override.include_headers:
            headers = [f'{name}/{h}' for h in override.include_headers if override.is_header_allowed(h)]
            all_headers |= set(headers)

    all_headers_sorted: List[str] = list(all_headers)
    all_headers_sorted.sort()

    return all_headers_sorted


def diff(a: List[str], b: List[str]) -> List[str]:
    dif = list(set(a) - set(b))
    dif.sort()

    return dif


def generate_source(headers: List[str]) -> str:
    with open('platform.natjgen') as f:
        content = json.load(f)

    content['source'] = '\n\n'.join([f'#import <{h}>' for h in headers])

    return json.dumps(content, indent=2, ensure_ascii=True)


def main():
    with open('platform.natjgen') as f:
        base_sdk: str = json.load(f)['base-sdk']
    framework_path = os.path.join(base_sdk, 'System/Library/Frameworks')

    latest_headers = scan_headers(framework_path)
    current_headers = load_existing_headers()

    print('Existing:         ', current_headers)
    print('Latest:           ', latest_headers)
    print('Existing - Latest:', diff(current_headers, latest_headers))
    print('Latest - Existing:', diff(latest_headers, current_headers))
    print(generate_source(latest_headers))


if __name__ == '__main__':
    main()
