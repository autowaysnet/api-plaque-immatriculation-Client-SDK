# coding: utf-8

"""
    API Car plate - API Plaque immatriculation

    Web Service which allows you to query the official database in real time by simply entering a license plate or a VIN. You allow your ecosystem to identify in one click the official data of a vehicle among the 80M license plates in France, Spain, Italy and Portugal.  # noqa: E501

    OpenAPI spec version: 1.0.0-oas3
    Contact: contact@auto-ways.net
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class CarInfoApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_car_by_plate_es(self, token, plaque, **kwargs):  # noqa: E501
        """Find car by plate  , country  (ES)  # noqa: E501

        Return vehicle data from license plate  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_car_by_plate_es(token, plaque, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str token: Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (required)
        :param str plaque: car plate  (required)
        :param str output_lang: Define the API output language (fr,en)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_car_by_plate_es_with_http_info(token, plaque, **kwargs)  # noqa: E501
        else:
            (data) = self.get_car_by_plate_es_with_http_info(token, plaque, **kwargs)  # noqa: E501
            return data

    def get_car_by_plate_es_with_http_info(self, token, plaque, **kwargs):  # noqa: E501
        """Find car by plate  , country  (ES)  # noqa: E501

        Return vehicle data from license plate  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_car_by_plate_es_with_http_info(token, plaque, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str token: Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (required)
        :param str plaque: car plate  (required)
        :param str output_lang: Define the API output language (fr,en)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['token', 'plaque', 'output_lang']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_car_by_plate_es" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'token' is set
        if ('token' not in params or
                params['token'] is None):
            raise ValueError("Missing the required parameter `token` when calling `get_car_by_plate_es`")  # noqa: E501
        # verify the required parameter 'plaque' is set
        if ('plaque' not in params or
                params['plaque'] is None):
            raise ValueError("Missing the required parameter `plaque` when calling `get_car_by_plate_es`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'token' in params:
            query_params.append(('token', params['token']))  # noqa: E501
        if 'plaque' in params:
            query_params.append(('plaque', params['plaque']))  # noqa: E501
        if 'output_lang' in params:
            query_params.append(('output_lang', params['output_lang']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/v1/es/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_car_by_plate_fr(self, token, plaque, **kwargs):  # noqa: E501
        """Find car by plate , country  (FR)  # noqa: E501

        Return vehicle data from license plate  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_car_by_plate_fr(token, plaque, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str token: Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (required)
        :param str plaque: car plate  (required)
        :param str output_lang: Define the API output language (fr,en)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_car_by_plate_fr_with_http_info(token, plaque, **kwargs)  # noqa: E501
        else:
            (data) = self.get_car_by_plate_fr_with_http_info(token, plaque, **kwargs)  # noqa: E501
            return data

    def get_car_by_plate_fr_with_http_info(self, token, plaque, **kwargs):  # noqa: E501
        """Find car by plate , country  (FR)  # noqa: E501

        Return vehicle data from license plate  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_car_by_plate_fr_with_http_info(token, plaque, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str token: Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (required)
        :param str plaque: car plate  (required)
        :param str output_lang: Define the API output language (fr,en)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['token', 'plaque', 'output_lang']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_car_by_plate_fr" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'token' is set
        if ('token' not in params or
                params['token'] is None):
            raise ValueError("Missing the required parameter `token` when calling `get_car_by_plate_fr`")  # noqa: E501
        # verify the required parameter 'plaque' is set
        if ('plaque' not in params or
                params['plaque'] is None):
            raise ValueError("Missing the required parameter `plaque` when calling `get_car_by_plate_fr`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'token' in params:
            query_params.append(('token', params['token']))  # noqa: E501
        if 'plaque' in params:
            query_params.append(('plaque', params['plaque']))  # noqa: E501
        if 'output_lang' in params:
            query_params.append(('output_lang', params['output_lang']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/v1/fr/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_car_by_plate_it(self, token, plaque, **kwargs):  # noqa: E501
        """Find car by plate  , country  (IT)  # noqa: E501

        Return vehicle data from license plate  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_car_by_plate_it(token, plaque, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str token: Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (required)
        :param str plaque: car plate  (required)
        :param str output_lang: Define the API output language (fr,en)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_car_by_plate_it_with_http_info(token, plaque, **kwargs)  # noqa: E501
        else:
            (data) = self.get_car_by_plate_it_with_http_info(token, plaque, **kwargs)  # noqa: E501
            return data

    def get_car_by_plate_it_with_http_info(self, token, plaque, **kwargs):  # noqa: E501
        """Find car by plate  , country  (IT)  # noqa: E501

        Return vehicle data from license plate  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_car_by_plate_it_with_http_info(token, plaque, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str token: Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (required)
        :param str plaque: car plate  (required)
        :param str output_lang: Define the API output language (fr,en)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['token', 'plaque', 'output_lang']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_car_by_plate_it" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'token' is set
        if ('token' not in params or
                params['token'] is None):
            raise ValueError("Missing the required parameter `token` when calling `get_car_by_plate_it`")  # noqa: E501
        # verify the required parameter 'plaque' is set
        if ('plaque' not in params or
                params['plaque'] is None):
            raise ValueError("Missing the required parameter `plaque` when calling `get_car_by_plate_it`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'token' in params:
            query_params.append(('token', params['token']))  # noqa: E501
        if 'plaque' in params:
            query_params.append(('plaque', params['plaque']))  # noqa: E501
        if 'output_lang' in params:
            query_params.append(('output_lang', params['output_lang']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/v1/it/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_car_by_plate_pt(self, token, plaque, **kwargs):  # noqa: E501
        """Find car by plate  , country  (PT)  # noqa: E501

        Return vehicle data from license plate  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_car_by_plate_pt(token, plaque, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str token: Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (required)
        :param str plaque: car plate  (required)
        :param str output_lang: Define the API output language (fr,en)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_car_by_plate_pt_with_http_info(token, plaque, **kwargs)  # noqa: E501
        else:
            (data) = self.get_car_by_plate_pt_with_http_info(token, plaque, **kwargs)  # noqa: E501
            return data

    def get_car_by_plate_pt_with_http_info(self, token, plaque, **kwargs):  # noqa: E501
        """Find car by plate  , country  (PT)  # noqa: E501

        Return vehicle data from license plate  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_car_by_plate_pt_with_http_info(token, plaque, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str token: Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (required)
        :param str plaque: car plate  (required)
        :param str output_lang: Define the API output language (fr,en)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['token', 'plaque', 'output_lang']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_car_by_plate_pt" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'token' is set
        if ('token' not in params or
                params['token'] is None):
            raise ValueError("Missing the required parameter `token` when calling `get_car_by_plate_pt`")  # noqa: E501
        # verify the required parameter 'plaque' is set
        if ('plaque' not in params or
                params['plaque'] is None):
            raise ValueError("Missing the required parameter `plaque` when calling `get_car_by_plate_pt`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'token' in params:
            query_params.append(('token', params['token']))  # noqa: E501
        if 'plaque' in params:
            query_params.append(('plaque', params['plaque']))  # noqa: E501
        if 'output_lang' in params:
            query_params.append(('output_lang', params['output_lang']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/v1/pt/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_car_by_vin(self, token, vin, **kwargs):  # noqa: E501
        """Find car by VIN  # noqa: E501

        Return vehicle data from license plate  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_car_by_vin(token, vin, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str token: Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (required)
        :param str vin:  Your VIN (Vehicle Identification Number) (required)
        :param str output_lang: Define the API output language (fr,en)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_car_by_vin_with_http_info(token, vin, **kwargs)  # noqa: E501
        else:
            (data) = self.get_car_by_vin_with_http_info(token, vin, **kwargs)  # noqa: E501
            return data

    def get_car_by_vin_with_http_info(self, token, vin, **kwargs):  # noqa: E501
        """Find car by VIN  # noqa: E501

        Return vehicle data from license plate  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_car_by_vin_with_http_info(token, vin, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str token: Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (required)
        :param str vin:  Your VIN (Vehicle Identification Number) (required)
        :param str output_lang: Define the API output language (fr,en)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['token', 'vin', 'output_lang']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_car_by_vin" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'token' is set
        if ('token' not in params or
                params['token'] is None):
            raise ValueError("Missing the required parameter `token` when calling `get_car_by_vin`")  # noqa: E501
        # verify the required parameter 'vin' is set
        if ('vin' not in params or
                params['vin'] is None):
            raise ValueError("Missing the required parameter `vin` when calling `get_car_by_vin`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'token' in params:
            query_params.append(('token', params['token']))  # noqa: E501
        if 'vin' in params:
            query_params.append(('vin', params['vin']))  # noqa: E501
        if 'output_lang' in params:
            query_params.append(('output_lang', params['output_lang']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/v1/vin/', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
